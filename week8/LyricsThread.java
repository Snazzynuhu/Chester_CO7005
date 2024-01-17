class LyricsThread1 extends Thread {
    private static final String[] LYRICS = {
            "Daisy, Daisy",
            "Give me your answer do",
            "I'm half crazy",
            "All for the love of you",
            "It won’t be a stylish marriage",
            "I can't afford a carriage",
            "But you'll look sweet on the seat",
            "Of a bicycle built for two"
    };

    public void run() {
        printLyrics(LYRICS);
    }

    private void printLyrics(String[] lyrics) {
        for (String line : lyrics) {
            System.out.println(line);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class LyricsThread2 extends Thread {
    private static final String[] LYRICS = {
            "Twinkle, twinkle, little star",
            "How I wonder what you are",
            "Up above the world so high",
            "Like a diamond in the sky",
            "When the blazing sun is gone",
            "When he nothing shines upon",
            "Then you show your little light",
            "Twinkle, twinkle, all the night"
    };

    public void run() {
         System.out.println("--------------------------"); 
        printLyrics(LYRICS);
    }

    private void printLyrics(String[] lyrics) {
        for (String line : lyrics) {
            System.out.println(line);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class LyricsThread {
    public static void main(String[] args) {
        LyricsThread1 lyrics1 = new LyricsThread1();
        LyricsThread2 lyrics2 = new LyricsThread2();

        lyrics1.start();
        try {
            lyrics1.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lyrics2.start();
    }
}
