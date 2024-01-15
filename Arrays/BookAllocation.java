// https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1
// Solved GFG hard book allocation problem

public class BookAllocation {
    public static void main(String[] args) {
        int books[] = { 12, 34, 67, 90 };
        int res = bookAllocation(books, 2);
        System.out.println(res);
    }

    public static int bookAllocation(int books[], int students) {
        if (books.length < students) {
            return -1;
        }

        int start = Integer.MIN_VALUE;
        int end = 0;

        for (int i = 0; i < books.length; i++) {
            if (books[i] > start) {
                start = books[i];
            }
            end = end + books[i];
        }

        int res = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isAllocationPossible(books, mid, students)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    static boolean isAllocationPossible(int books[], int maxPages, int students) {
        int currentStudent = 1;
        int pages = 0;

        for (int i = 0; i < books.length; i++) {
            pages += books[i];
            if (pages > maxPages) {
                currentStudent += 1;
                pages = books[i];
            }
            if (currentStudent > students) {
                return false;
            }
        }

        return true;
    }
}
