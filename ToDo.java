/*
 * @Chris Moller
 * This is to help me stay organized on my To Do list
 *
 */
import java.util.*;
import java.lang.*;

 public class ToDo {
     public static void main(String[] args) {
	// short script, so all vars are global
        Scanner sc = new Scanner(System.in);
        boolean complete = false;
        ArrayList<String> items = new ArrayList<>();
        String task = "";
        int taskNum;

	// input validation is a little scant here. 
	// collecting tasks to populate to-do list
        while(!complete) {
            System.out.println("\nPlease add a new task or type f if finished: \n");
            try {
                task = sc.nextLine();
                items.add(task);
	      // there's really nothing to catch here, but this is just a security measure
            } catch (Exception e) {
                System.out.println("Input invalid");
                sc.nextLine();
            }
	    // avoiding an infinite loop
            complete = task.equalsIgnoreCase("F") ? true : false;
        }
	
	// initial print
	// excludes your final 'f', saved as last item in order to help with debugging
	// this can be refactored so that the f is not required now that the logic has been tested
        System.out.println("\nPrinting tasks...\n\n");
        for (int i = 0; i < items.size() - 1; i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
        System.out.println("");
        complete = false;

	// keeps cycling and reassigning task numbers until all tasks have been completed
        while (!complete) {
            System.out.println("\nWhen you have completed a task, please type the number next to that task: \n");
            try {
                taskNum = sc.nextInt();
                if (taskNum > 0 && taskNum < items.size()) {
                    System.out.println("Task: " + (items.get(taskNum - 1)).toUpperCase() + " successfully completed\n\n");
                    items.remove(taskNum - 1);
                    System.out.println("\nHere is your new list: \n");
                    for (int i = 0; i < items.size() - 1; i++) {
                        System.out.println((i + 1) + ". " + items.get(i));
                    }
                }
	      // catching all exceptions. 
	      // most will be value errors
            } catch (Exception e) {
                System.out.println("Input invalid");
                sc.nextLine();
            }
	    // the one remaining item is that hidden f to break the loop when populating the list
	    // eventually this will be refactored and the 1 should be changed to a 0
            complete = items.size() == 1 ? true : false;
        }

        System.out.println("Success! Great work!");
        sc.close();
     }
 } 