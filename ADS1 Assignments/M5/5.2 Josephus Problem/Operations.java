/**
 * Initializing Array package.
 */
import java.util.Arrays;
/**.
 * Class for node.
 * It has data and next
 */
class Node {
    int data;
    Node next;
    Node(int value) {
        data = value;
        next = null;
    }
    /**.
     * Gets the address.
     *
     * @return     The address.
     * returns next
     */
    public Node getAddress() {
        return next;
    }
    /**.
     * Sets the address.
     *
     * @param      address  The address
     */
    public void setAddress(Node address) {
        next = address;
    }

    /**.
     * { function_description }
     *
     * @param      data1  The data 1
     */
    public void setdata(int data1) {
        data = data1;
    }
}
/**
 * Class for operations.
 * initializing Operations parameters head & tail.
 */
class Operations {
    Node head;
    Node tail;
    int size;
    /**
     * { function_description }
     *
     * @param      data  The data
     */
    public void insertAtHead(int data) {
        Node start = new Node(data);
        size++;
        if (head == null) {
            head = start;
            tail = start;
            return;
        }
        start.setAddress(head);
        head = start;
        return;
    }

    /**
     * { function_description }
     *
     * @param      data     The data
     * @param      element  The element
     */
    public void insertAfterElement(int data, int element) {
        Node ins = new Node(element);
        Node temp1 = head;
        int flag = 0;
        while (temp1.data != data) {
            temp1 = temp1.getAddress();
            if (temp1.data == data) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            Node temp2 = temp1.getAddress();
            temp1.setAddress(ins);
            ins.setAddress(temp2);
            size++;
        }
    }
    /**
     * { function_description }
     *
     * @param      data  The data
     */
    public void insertAtTail(int data) {
        Node end = new Node(data);
        size++;
        if (head == null) {
            head = end;
            tail = end;
            return;
        }
        tail.next = end;
        tail = end;
        return;
        // System.out.println(printList());
    }
    /**
     * if size is zero then print deck is empty
     * set temp as head Node
     */
    public void popAtHead() {
        if (size == 0) {
            System.out.println("Deck is empty");
            return;
        }
        Node temp = head;
        head = head.getAddress();
        temp = null;
        size--;
    }

    public void popAtTail() {
        if (size == 0) {
            System.out.println("Deck is empty");
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.getAddress();
        }
        tail = temp;
        temp.next = null;
        size--;
    }
    /**
     * deleting the next element
     *
     * @param      data  The data
     */
    public void deleteAfterElement(int data) {
        Node temp = head;
        while (temp.data != data) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
    /**
     * printing the list
     *
     * @return     { description_of_the_return_value }
     */
    public String printList() {
        Node temp = head;
        String str = "[";
        if (size > 0) {
            while (temp.next != null) {
                str += temp.data + ", ";
                temp = temp.getAddress();
            }
            str += temp.data;
        }
        str += "]";
        return str;
    }
    /**
     * return size
     *
     * @return     { description_of_the_return_value }
     */
    public int size() {
        return size;
    }
    /**
     *
     *
     * @param      m     { parameter_description }
     * @param      size  The size
     *
     * @return     { description_of_the_return_value }
     */
    public int[] josephus(int m, int size) {
        int[] arr = new int[size];
        Node temp = head;
        int counter = 1;
        int i = 0;
        while (temp.next != null) {
            while (counter != m) {
                insertAtTail(temp.data);
                temp = temp.next;
                popAtHead();
                counter++;
            }
        arr[i++] = temp.data;
        temp = temp.next;
        counter = 1;
        popAtHead();
        }
        arr[i++] = temp.data;
        return arr;
    }
}
