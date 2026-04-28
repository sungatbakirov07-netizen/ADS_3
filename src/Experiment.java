import java.util.Arrays;
public class Experiment {
    private Sorter sorter;
    private Searcher searcher;
    public Experiment() {
        sorter = new Sorter();
        searcher = new Searcher();
    }
    public long measureSearchTime(int[] arr, int target) {
        long startTime = System.nanoTime();
        searcher.search(arr, target);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    public long measureSortTime(int[] arr, String type) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        long startTime = System.nanoTime();
        if (type.equalsIgnoreCase("basic")) {
            sorter.basicSort(copy);
        } else {
            sorter.advancedSort(copy);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};
        for (int size : sizes) {
            System.out.println("\n============================");
            System.out.println("Array Size: " + size);
            System.out.println("============================");
            int[] randomArray = sorter.generateRandomArray(size);
            int[] sortedArray = Arrays.copyOf(randomArray, randomArray.length);
            Arrays.sort(sortedArray);
            long insertionRandom = measureSortTime(randomArray, "basic");
            long mergeRandom = measureSortTime(randomArray, "advanced");
            long insertionSorted = measureSortTime(sortedArray, "basic");
            long mergeSorted = measureSortTime(sortedArray, "advanced");
            sorter.advancedSort(sortedArray);
            int target = sortedArray[size / 2];
            long searchTime = measureSearchTime(sortedArray, target);
            System.out.println("Random Array Results:");
            System.out.println("Insertion Sort Time: " + insertionRandom + " ns");
            System.out.println("Merge Sort Time: " + mergeRandom + " ns");
            System.out.println();
            System.out.println("Sorted Array Results:");
            System.out.println("Insertion Sort Time: " + insertionSorted + " ns");
            System.out.println("Merge Sort Time: " + mergeSorted + " ns");
            System.out.println();
            System.out.println("Binary Search Time: " + searchTime + " ns");
        }
    }
}