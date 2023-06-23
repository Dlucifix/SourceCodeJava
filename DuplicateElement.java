//chương trình in các phần tử trùng nhau trong mảng java
public class DuplicateElement
{
    public static void main(String[] args) {
        //khởi tạo mảng
        int[] arr = new int[] {1,2,3,4,2,7,8,8,3};
        System.out.println("cac phan tu trung nhau trong mang da cho: ");
        //tìm kiếm phần tử trùng lặp
        for(int i = 0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}