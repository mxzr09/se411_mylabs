package exercise3;

public class Main {

    public static void main(String[] args) {

        PipeLine<String, String> textPipeline =
                PipeLine.<String>start()
                        .addTransformer(text -> text.trim())
                        .addTransformer(text -> text.toUpperCase());

        PipeLine<String, Integer> lengthPipeline =
                textPipeline.addTransformer(text -> text.length());

        String cleanedText =
                textPipeline.execute("  hello generics  ");

        Integer textLength =
                lengthPipeline.execute("  hello generics  ");

        System.out.println("Cleaned text: " + cleanedText);
        System.out.println("Text length: " + textLength);
    }
}