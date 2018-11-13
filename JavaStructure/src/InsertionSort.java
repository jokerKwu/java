import java.util.Scanner;
public class InsertionSort {
	static void insertionSort(int[] arr,int n) {
		for(int i=1;i<n;i++) {	
			int j;
			int tmp=arr[i];
			for(j=i;j>0&&arr[j-1]>tmp;j--)	//j�� 0���� ũ�ų� arr[j-1]>arr[i]�̸� 
				arr[j]=arr[j-1];			
			arr[j]=tmp;	
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("���� ����");
		System.out.println("��� ����>>");
		int num=input.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("�������� ���� ��");
		System.out.println("==================");
		for(int i=0;i<num;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
		insertionSort(arr,num);
		System.out.println("==================");
		System.out.println("�������� ���� ��");
		for(int i=0;i<num;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
}
