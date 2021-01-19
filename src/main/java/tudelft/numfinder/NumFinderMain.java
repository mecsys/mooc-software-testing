package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        // nf.find(new int[] {4, 25, 7, 9});

        // this crashes
//        nf.find(new int[] {4, 3, 2, 1});
        nf.find(new int[] {5,4,3,2,1,Integer.MAX_VALUE, 9,6,7,8, Integer.MIN_VALUE, 0,1,2,3});

        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}
