import java.util.*;

public class OnTheWayToAnnapurna_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();
        Map<String,List<String>>diary = new TreeMap<>(Collections.reverseOrder());

        while (!inputData.equals("END")){
            String[] inputCommands = inputData.split("->");

            String command = inputCommands[0];
            String store = inputCommands[1];

            if (command.equals("Add")){
                List<String> items = Arrays.asList(inputCommands[2].split(","));

                if (!diary.containsKey(store)){
                    diary.put(store,new ArrayList<>());
                    for (int i = 0; i < items.size() ; i++) {
                        diary.get(store).add(items.get(i));
                    }
                }else{
                    for (int i = 0; i < items.size() ; i++) {
                        diary.get(store).add(items.get(i));
                    }
                }
            }else if (command.equals("Remove")){
                if (diary.containsKey(store)){
                    diary.remove(store);
                }
            }

            inputData = scanner.nextLine();
        }
        System.out.println("Stores list:");
        diary.entrySet().stream().sorted((a,b)-> Integer.compare(b.getValue().size(),a.getValue().size())).forEach(e ->
                {
                    System.out.println(e.getKey());
                    for (int i = 0; i <e.getValue().size() ; i++) {
                        System.out.println(String.format("<<%s>>",e.getValue().get(i)));
                    }
                }
        );
    }
}