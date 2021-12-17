package buihongson_qlbhcns;

import java.util.ArrayList;

import java.util.Scanner;
public class BuiHongSon_App {

	public static void main(String[] args) {
	int choose, n;
	ArrayList<BuiHongSon_TacGia> authorList = new ArrayList<>();
	ArrayList<BuiHongSon_Sach> bookList = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	
	do {
		showMenu();
		choose = Integer.parseInt(input.nextLine());
		switch (choose) {
			case 1: 
				System.out.println("Nhập số sách cần thêm");
				 n = Integer.parseInt(input.nextLine());
				 for (int i = 0; i < n; i++) {
					 BuiHongSon_Sach book = new BuiHongSon_Sach();
					book.input();
					boolean isFind = false;
					for (int j = 0; j < authorList.size(); j++) {
						if(authorList.get(j).getNickname().equalsIgnoreCase(book.getNickname())) {
							isFind = true;
							break;
						}
					}
					if(!isFind) {
						BuiHongSon_TacGia author = new BuiHongSon_TacGia(book.getNickname());
						author.input();
						authorList.add(author);						
					}
					bookList.add(book);
				}
		    	break;
			
			case 2: 
			for (BuiHongSon_Sach book : bookList) {
				book.display();
			}
		     	break;
			case 3: 
				System.out.println("Nhập số tác giả cần thêm");
				n = Integer.parseInt(input.nextLine());
				for (int i = 0; i < n; i++) {
					BuiHongSon_TacGia author = new BuiHongSon_TacGia();
					author.input(authorList);
				authorList.add(author);
					
				}
			    break;
			case 4: 
				System.out.println("Nhập tên bút danh cần tìm kiếm: ");
				String nickname = input.nextLine();
				for (int i = 0; i < bookList.size(); i++) {
					if(bookList.get(i).getNickname().equalsIgnoreCase(nickname))
					{
						bookList.get(i).display();
					}
				}
				break;
			case 5:
				System.out.println("Nhập tên sách cần xóa: ");
				 n = Integer.parseInt(input.nextLine());
				 for (BuiHongSon_TacGia author : authorList) {
					author.delete(bookList, n);
				}
				
				break;
			case 6: 
				System.out.println("Số sách hiện có là:" + bookList.size());
				break;
			case 7:				
				System.out.println("Thoái khỏi chương trình");
				break;
		default:System.err.println("Nhập sai");
	
		}
		
	} while (choose != 7);
	
	}
static void showMenu() {
	System.out.println("Bùi Hồng Sơn - Quản lý bán hàng cho nhà sách");
	System.out.println("1.Nhập thông tin sách");
	System.out.println("2.Hiển thị tất cả sách ra màn hình");
	System.out.println("3.Nhập thông tin tác giả");
	System.out.println("4.Tìm kiếm sách theo bút danh");
	System.out.println("5.xóa sách");
	System.out.println("6.Thống kê sách hiện có");
	System.out.println("7.Thoát");
}
}
