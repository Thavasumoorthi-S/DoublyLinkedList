package org.example;
import java.util.Scanner;


public class DoublyLinkedList
{
    Node Rootnode=null;
    Node current=null;
    //int index=0;
    class Node{
        Node prevnode;
        int data;
        Node nextNode;

        Node(int data)
        {
            this.data=data;
        }
    }

    public void add(int value)
    {
        if(Rootnode==null)
        {
            Rootnode =new Node(value);
            Rootnode.prevnode=null;
            Rootnode.nextNode=null;
            // this.index++;
        }
        else{

            current=new Node(value);
            current.prevnode=null;
            current.nextNode=Rootnode;
            Rootnode=current;
            current=null;
            //this.index++;
        }
    }
    public void display()
    {
        Node temp=Rootnode;
        while(temp.nextNode!=null)
        {
            System.out.println(temp.data);
            temp=temp.nextNode;
        }
        if(temp.nextNode==null)
        {
            System.out.println(temp.data);
        }
    }
    public void Remove()
    {
        System.out.println("Remove operation ");
        Node temp1=this.Rootnode;
        if(temp1.nextNode==null)
        {
            System.out.println("Only one element is present..");
        }
        else{
            Node temp2=this.Rootnode.nextNode.nextNode;

            while(temp2!=null)
            {
                temp1=temp1.nextNode;
                temp2=temp2.nextNode;

            }
            temp1.nextNode=null;
        }

    }
    public void insertatposition(int indecx,int element)
    {
        int index=1;
        Node temps=this.Rootnode;
        while(index!=indecx)
        {
            System.out.println("-----------------------------"+temps.data);
            temps=temps.nextNode;
            index++;
        }
        Node currNode=new Node(element);
        currNode.nextNode=temps.nextNode;
        temps.nextNode=currNode;

    }
    public void deleteatposoition(int index)
    {
        if(index==0)
        {
            this.Rootnode=this.Rootnode.nextNode;
        }
        else{
            Node temp3=this.Rootnode;
            // Node temp4=this.Rootnode.nextNode;
            int index1=1;
            while(index1!=index)
            {
                temp3=temp3.nextNode;
                index1++;
            }
            temp3.nextNode=temp3.nextNode.nextNode;
        }

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        DoublyLinkedList dl=new DoublyLinkedList();
        int choice;
        int element;
        int index;
        while(true)
        {
            System.out.println("\n1)Add element \n2)Remove Element \n3)display \n4)insert at position \n5)delete at position \n6)exit");
            System.out.println("Choose any one of the option in gthe above ");
            choice=sc.nextInt();
            if(choice==1)
            {
                System.out.println("Enter the element ");
                element=sc.nextInt();
                dl.add(element);

            }
            else if(choice==2)
            {
                dl.Remove();
            }
            else if(choice==3)
            {
                dl.display();
            }
            else if(choice==4)
            {
                System.out.println("Enter the index :");
                index=sc.nextInt();
                System.out.println("Enter the element :");
                element=sc.nextInt();
                dl.insertatposition(index, element);

            }
            else if(choice==5)
            {
                System.out.println("Enter the index :");
                index=sc.nextInt();
                dl.deleteatposoition(index);
            }
            else if(choice==6)
            {
                break;
            }
        }

    }
}
