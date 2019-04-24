package Exercise;

import java.util.*;

public class LegendaryFarming_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        Map<String, Integer> junks = new LinkedHashMap<>();

        String winner = "";
        boolean flag = false;

        do {
            String[] inputData = scanner.nextLine().split("\\s+");

            for (int i = 0; i < inputData.length; i += 2) {

                int materialQuantity = Integer.parseInt(inputData[i]);
                String key = inputData[i + 1].toLowerCase();

                if (!materials.containsKey(key)) {
                    if (!junks.containsKey(key)) {
                        junks.put(key, materialQuantity);
                    } else {
                        junks.put(key, junks.get(key) + materialQuantity);
                    }
                } else {
                    materials.put(key, materials.get(key) + materialQuantity);

                    if (materials.get(key) >= 250) {
                        materials.put(key, materials.get(key) - 250);
                        winner = key;
                        flag = true;
                        break;
                    }
                }
            }
        } while (!flag);

        if (winner.equals("shards")) {
            System.out.println("Shadowmourne obtained!");
        } else if (winner.equals("motes")) {
            System.out.println("Dragonwrath obtained!");
        } else if (winner.equals("fragments")) {
            System.out.println("Valanyr obtained!");
        }


        materials.entrySet().stream().sorted((a, b) -> {

            int sort = Integer.compare(b.getValue(), a.getValue());

            if (sort == 0) {
                sort = a.getKey().compareTo(b.getKey());
            }
            return sort;

        }).forEach(e -> {
            System.out.printf("%s: %d%n", e.getKey(), e.getValue());
        });


        //ако вместо да правим foreach, искаме да го запазим в нов map: правим си нов мап, в който запазваме стария:

//        Map<String,Integer> result = new LinkedHashMap<>();
//
//        materials.entrySet().stream().sorted((a, b) -> {
//
//            int sort = Integer.compare(b.getValue(), a.getValue());
//
//            if (sort == 0) {
//                sort = a.getKey().compareTo(b.getKey());
//            }
//            return sort;
//
//        }).forEach(e -> {
//            result.put(e.getKey(),e.getValue());
//        });


        junks.entrySet().stream().sorted((a,b) -> a.getKey().compareTo(b.getKey())).forEach( e ->{
            System.out.printf("%s: %d%n", e.getKey(),e.getValue());
        });
    }
}