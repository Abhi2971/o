class ThreadNameAndPriorityDemo extends Thread {
    @Override
    public void run() {
        // Keeping the run method empty
        try {
            Thread.sleep(1000); // Simulate some work
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }
    }

    public static void main(String[] args) {
        ThreadNameAndPriorityDemo thread = new ThreadNameAndPriorityDemo();

        // Display original name and priority
        System.out.println("Original Thread Name: " + thread.getName());
        System.out.println("Original Thread Priority: " + thread.getPriority());

        // Change the thread name to "Java Thread"
        thread.setName("Java Thread");
        System.out.println("New Thread Name: " + thread.getName());

        // Start the thread to make it alive
        thread.start();
        System.out.println("Is Thread Alive? " + thread.isAlive());
    }
}

    