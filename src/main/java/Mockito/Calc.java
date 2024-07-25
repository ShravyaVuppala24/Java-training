package Mockito;

public class Calc {
    private final MathService mathService;

    public Calc(MathService mathService) {
        this.mathService = mathService;
    }

    public int add(int a, int b) {
        return mathService.add(a, b);
    }
}

