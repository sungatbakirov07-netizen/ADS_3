# Sorting and Searching Algorithm Analysis System

## Project Overview
This project compares sorting and searching algorithms.

Algorithms used:
- Insertion Sort
- Merge Sort
- Binary Search

---

## Project Structure

```text
src/
├── Experiment.java
├── Main.java
├── Searcher.java
└── Sorter.java
```
##Screenshots
docs/
main/<img width="693" height="232" alt="image" src="https://github.com/user-attachments/assets/aab13766-e86a-44b6-8e59-3f7550ad553e" />
insertion sort/<img width="384" height="351" alt="image" src="https://github.com/user-attachments/assets/4a234c06-ad81-44da-a1b6-acd2ab6f9a95" />
merge sort/<img width="343" height="245" alt="image" src="https://github.com/user-attachments/assets/d115769a-f527-44ea-baf5-f730e75e4fe9" />
merge sort/<img width="289" height="260" alt="image" src="https://github.com/user-attachments/assets/e72f2c62-fdb5-41d3-af8d-defb3d445d08" />
searcher/<img width="506" height="485" alt="image" src="https://github.com/user-attachments/assets/43df849e-fc7c-454a-b1b0-752c3ef4825d" />
experiment/<img width="314" height="281" alt="image" src="https://github.com/user-attachments/assets/4bdf4293-0061-4c0a-afcd-8df6a8d4ffc9" />
experiment/<img width="325" height="284" alt="image" src="https://github.com/user-attachments/assets/006fa14f-b646-47d4-9b96-fc546179f784" />

---

## Algorithms

### Insertion Sort
Basic sorting algorithm.

Time Complexity:
- Best: O(n)
- Average: O(n²)
- Worst: O(n²)

### Merge Sort
Advanced divide-and-conquer sorting.

Time Complexity:
- O(n log n)

### Binary Search
Searches in sorted arrays.

Time Complexity:
- O(log n)

---

## Experimental Results

| Array Size | Insertion Sort | Merge Sort | Binary Search |
|------------|----------------|------------|---------------|
| 10 | Fast | Faster | Very Fast |
| 100 | Slower | Fast | Slower |
| 1000 | Slowest | Fastest | Slowest |

| Array Size | Insertion Sort (ns) | Merge Sort (ns) | Binary Search (ns) |
|------------|----------------------|------------------|---------------------|
| 10 | 31,000 | 15,000 | 2,000 |
| 100 | 98,000 | 46,000 | 3,000 |
| 1000 | 1,250,000 | 180,000 | 5,000 |

---

## Reflection
This project helped understand algorithm efficiency.
