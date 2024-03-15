package linkedlist;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class IntersectionLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while (pointerA != pointerB) {
            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

        return pointerA;
    }

    // Example usage
    public static void main(String[] args) {
        IntersectionLinkedLists solution = new IntersectionLinkedLists();

        // Create example lists
        ListNode listA = new ListNode(4);
        listA.next = new ListNode(1);
        listA.next.next = new ListNode(8);
        listA.next.next.next = new ListNode(4);
        listA.next.next.next.next = new ListNode(5);

        ListNode listB = new ListNode(5);
        listB.next = new ListNode(6);
        listB.next.next = new ListNode(1);
        // Intersection node
        listB.next.next.next = listA.next.next; // Intersection point

        // Function call
        ListNode intersectedNode = solution.getIntersectionNode(listA, listB);

        if (intersectedNode != null) {
            System.out.println("Intersected at: " + intersectedNode.val);
        } else {
            System.out.println("No intersection");
        }
    }
}

