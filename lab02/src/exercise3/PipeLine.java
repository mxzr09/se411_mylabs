package exercise3;

public class PipeLine<T, R> {

    private final Transformer<T, R> transformationChain;

    private PipeLine(Transformer<T, R> transformationChain) {
        this.transformationChain = transformationChain;
    }

    public static <T> PipeLine<T, T> start() {
        return new PipeLine<>(input -> input);
    }

    public <V> PipeLine<T, V> addTransformer(
            Transformer<R, V> nextTransformer) {

        Transformer<T, V> newChain = input -> {
            R currentOutput = transformationChain.transform(input);
            return nextTransformer.transform(currentOutput);
        };

        return new PipeLine<>(newChain);
    }
    
    public R execute(T input) {
        return transformationChain.transform(input);
    }
}