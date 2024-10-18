class ThreadPriorityDemo extends Thread {
    @Override
    public void run() {
        // Just keeping the run method empty
    }

    public static void main(String[] args) {
        ThreadPriorityDemo thread = new ThreadPriorityDemo();

        // Display original name and priority
        System.out.println("Original Thread Name: " + thread.getName());
        System.out.println("Original Thread Priority: " + thread.getPriority());

        // Change the thread priority to 7
        thread.setPriority(7);
        System.out.println("New Thread Priority: " + thread.getPriority());
        
        // Start the thread
        thread.start();
    }
}
