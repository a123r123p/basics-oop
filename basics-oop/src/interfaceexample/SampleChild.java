package interfaceexample;

public class SampleChild implements SampleInterface,SampleInterface2{
    @Override
    public void sample() {
        System.out.println("sample1 implementation inside SampleChild");
    }

    @Override
    public void sample2() {
        System.out.println("sample2 implementation inside SampleChild");
    }

    @Override
    public void sample3() {
        System.out.println("sample3  implementation inside SampleChild");

    }

    @Override
    public void sample6() {
        System.out.println("sample6 implementation inside SampleChild from SampleInterface");
    }

    @Override
    public void sample5() {
        System.out.println("sample5 implementation inside SampleChild from SampleInterface2");
    }

    @Override
    public void samples6() {
        System.out.println("sample6 implementation inside SampleChild from SampleInterface2");

    }
}
