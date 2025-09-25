class Solution {
    public ListNode middleNode(ListNode head) {
        List<ListNode> ls = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            ls.add(curr);
            curr = curr.next;
        }

        return ls.get(ls.size() / 2); // directly return the node
    }
}
