class TextPrinterThread extends Thread {
    private String text;
    private int times;

    public TextPrinterThread(String text, int times) {
        this.text = text;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + text);
        }
    }

    public static void main(String[] args) {
        // Creating 3 threads with different text and repeat counts
        TextPrinterThread thread1 = new TextPrinterThread("Hello, World!", 5);
        TextPrinterThread thread2 = new TextPrinterThread("Java Programming", 3);
        TextPrinterThread thread3 = new TextPrinterThread("Multithreading in Java", 4);

        // Start the threads
        thread1.setName("Thread 1");
        thread2.setName("Thread 2");
        thread3.setName("Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
