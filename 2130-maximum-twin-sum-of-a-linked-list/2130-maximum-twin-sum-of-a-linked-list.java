/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ArrayList <Integer> list = new ArrayList();
        while(slow!=null){
            list.add(slow.val);
            slow=slow.next;
        }
        Collections.reverse(list);
        int max = 0;
        
        ListNode temp = head;
        int i = 0;
        while(i<list.size()){
           int sum = temp.val + list.get(i);
            temp = temp.next;
            max = Math.max(max,sum);
            i++;

        }
        return max;
        
        
    }
}