class ReverseThread extends Thread {
    public ReverseThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 100; i >= 1; i--) {
                System.out.println(Thread.currentThread().getName() + " - Count: " + i);
                Thread.sleep(2000);  // Sleep for 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }
    }

    public static void main(String[] args) {
        ReverseThread thread = new ReverseThread("Reverse Counter Thread");
        System.out.println("Original Thread Name: " + thread.getName());
        thread.setName("Custom Thread Name");
        System.out.println("New Thread Name: " + thread.getName());
        thread.start();
    }
}
