package Exercise1;

/**
 * Your Name:        YAKUP BARTU BAŞKAYA
 * Your Student ID:  240444051
 * Your Date:        16.11.2026
 */

public class QueueDemo {

    public static void main(String[] args) {

        String[] students = {
            "Ali", "Ayse", "Mehmet", "Zeynep", "Ahmet",
            "Elif", "Mustafa", "Fatma", "Can", "Ece",
            "Burak", "Deniz", "Emre", "Selin", "Mert",
            "Ceren", "Kerem", "Dilan", "Onur", "Seda"
        };

        // TODO: Create your Queue object with capacity 10.
        Queue<String> queue = new Queue<>(10);

        // TODO: Insert the first 10 student names into the queue.
        // Use a for loop.
        for (int i = 0; i < 10; i++) {
            queue.enqueue(students[i]);
        }

        // TODO: Display the original queue.
        System.out.println("Original Queue: " + queue);

        // TODO: Display the queue size.
        System.out.println("Queue Size: " + queue.size());

        // TODO: Display the first student using peek().
        System.out.println("First Student: " + queue.peek());

        // TODO: Remove three students using dequeue().
        // Display the name of each removed student.
        System.out.println("\nRemoving three students:");
        System.out.println("Removed: " + queue.dequeue());
        System.out.println("Removed: " + queue.dequeue());
        System.out.println("Removed: " + queue.dequeue());

        // TODO: Display the remaining queue.
        System.out.println("\nQueue After Removal: " + queue);

        // TODO: Display the final queue size.
        System.out.println("Final Queue Size: " + queue.size());
        // 11 eklemek istersek 
        //QUESTION: if I want to add the student[11], (because I have dequeue 3 student so there is empty parts in the array)
        // Try the code bellow and give an answer to: why does it give an error? and what can you use to add the 11 student to the array?
        System.out.println("\nAdding student: " + students[11]);
        queue.enqueue(students[11]);
        System.out.println("Queue After Adding: " + queue);
        System.out.println("Queue Size: " + queue.size());

        // Answer:
        // 1) Why does it give an error?
        //    In a linear array queue (using rear++), after inserting 10 elements rear is at index 9.
        //    Even after removing 3 elements (making indices 0, 1, 2 empty and count = 7),
        //    calling enqueue() increments rear to 10, which causes an ArrayIndexOutOfBoundsException.
        // 2) What can you use to add the 11th student to the array?
        //    We can use a Circular Queue (circular indexing with modulo operator:
        //    rear = (rear + 1) % items.length and front = (front + 1) % items.length)
        //    so that rear wraps around to index 0 and reuses the empty spaces at the beginning of the array.
    }
}
