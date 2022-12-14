package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Itenary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get the no of tickets from input
        int n = in.nextInt();

        // map to store all the tickets
        Map<String, String> tickets = new HashMap<String, String>();

        // Store the source and destination of the tickets to the map "tickets"
        for (int i = 0; i < n; i++) {
            tickets.put(in.next(), in.next());
            in.nextLine();
        }

        // write your code here
        Map<String, String> reverseMap = new HashMap<String, String>();

        // To fill reverse map, iterate through the given map
        for (Map.Entry<String,String> entry: tickets.entrySet())
            reverseMap.put(entry.getValue(), entry.getKey());

        // Find the starting point of itinerary
        String start = null;
        for (Map.Entry<String,String> entry: tickets.entrySet())
        {
            if (!reverseMap.containsKey(entry.getKey()))
            {
                start = entry.getKey();
                break;
            }
        }

        // If we could not find a starting point, then something wrong
        // with input
        if (start == null)
        {
            System.out.println("Invalid");
            return;
        }
        String to = tickets.get(start);
        System.out.print(start+" ");
        while (to != null)
        {
            System.out.print(to+" ");
            start = to;
            to = tickets.get(to);
        }
    }

    }

