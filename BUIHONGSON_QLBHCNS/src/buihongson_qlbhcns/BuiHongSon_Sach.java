package buihongson_qlbhcns;

import java.util.Scanner;
public class BuiHongSon_Sach {
String bookName;
String createAt;
String nickname;
public BuiHongSon_Sach() {
	super();
}
public void input() {
	System.out.println("----------------------------");
	Scanner input = new Scanner(System.in);
	System.out.println("Nhập tên sách: ");
	bookName = input.nextLine();
	System.out.println("Ngày xuất bản: ");
	createAt = input.nextLine();
	System.out.println("Nhập tác giả: ");
	nickname = input.nextLine();
}
public BuiHongSon_Sach(String bookName, String createAt, String nickname) {
	super();
	this.bookName = bookName;
	this.createAt = createAt;
	this.nickname = nickname;
}

public void display() {
	System.out.println(toString());
}

public String toString() {
	return "Sách [Tên sách=" + bookName + ", Ngày xuất bản=" + createAt + ", Bút danh=" + nickname + "]";
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getCreateAt() {
	return createAt;
}
public void setCreateAt(String createAt) {
	this.createAt = createAt;
}
public String getNickname() {
	return nickname;
}
public void setNickname(String nickname) {
	this.nickname = nickname;
}
}
