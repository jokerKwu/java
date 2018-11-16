import java.util.Scanner;
public class ShellSort {
	static void shellSort(int[] arr,int n) {
		int h;
		for(h=1;h<n/9;h=h*3+1);	//h�� �ʱ갪 ���ϱ�
		
		for(;h>0;h/=3) {
			for(int i=h;i<n;i++) {
				int j;
				int tmp=arr[i];
				for(j=i-h;j>=0&&arr[j]>tmp;j-=h)
					arr[j+h]=arr[j];
				arr[j+h]=tmp;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�� ����(���� 2");
		System.out.println("��� ��>>");
		int n=input.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}

		System.out.println("���� ��");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
		
		shellSort(arr,n);
		System.out.println("������������ ����");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
}
