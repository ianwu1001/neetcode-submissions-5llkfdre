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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> seen = new HashSet();

        ListNode currentNode = head;

        while(currentNode != null){

            if(seen.contains(currentNode)){
                return true;
            }else{
                seen.add(currentNode);
                currentNode = currentNode.next;
            }                      
        }
        return false;
    }
}
