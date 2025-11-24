# Question : 
https://leetcode.com/problems/reverse-linked-list/description/
## Solution : 
```
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
    public ListNode reverseList(ListNode head) {
        ListNode res=null;
        while(head!=null){
            ListNode temp= head.next;
            head.next=res;
            res=head;
            head=temp;
        }
        return res;
    }
}
```
# Question 2: 
https://leetcode.com/problems/middle-of-the-linked-list/description/
```
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
    public ListNode middleNode(ListNode head) {
         ListNode slow=head;
          ListNode fast=head;
          while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
          }
          return slow;
    }
}
```

# Question 3 : 
https://leetcode.com/problems/linked-list-cycle/description/
## Solution: 
```
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            return true;
        }
       } 
       return false;
    }
}
```
# Question 4: 
https://leetcode.com/problems/palindrome-linked-list/
## Solution: 
```
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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st= new Stack<>();
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            st.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null){
            slow=slow.next;
        }
        while(slow!=null&&!st.isEmpty()){
            int stVal=st.pop();
            int listVal=slow.val;
            if(stVal!=listVal){
                return false;
            }
            slow=slow.next;
           
        }
        return true&&st.isEmpty();
    }
}
```