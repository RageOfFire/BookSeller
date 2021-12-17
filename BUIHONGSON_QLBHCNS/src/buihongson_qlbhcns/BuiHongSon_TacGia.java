package buihongson_qlbhcns;
import java.util.ArrayList;
import java.util.Scanner;

public class BuiHongSon_TacGia extends BuiHongSon_Sach {
private String name;
private int old;
private String nickname;
private String birthday;
private String address;
public BuiHongSon_TacGia(String name, int old, String nickname, String birthday, String address) {
	super();
	this.name = name;
	this.old = old;
	this.nickname = nickname;
	this.birthday = birthday;
	this.address = address;
	
}
public BuiHongSon_TacGia() {
	super();
}

public BuiHongSon_TacGia(String nickname) {
	super();
	this.nickname = nickname;
}
public void input(ArrayList<BuiHongSon_TacGia> authorList) {
	input();
	Scanner input = new Scanner(System.in);
	System.out.println("Nhập bút danh");
	while (true){
		nickname = input.nextLine();
		boolean isFind = false;
		for (int i = 0; i < authorList.size(); i++) {
			if(authorList.get(i).getNickname().equalsIgnoreCase(nickname)) {
				isFind = true;
			}
			
		}
		if(!isFind) {
			break;
		}
		else {
			System.err.println("Nhập bút danh khác: ");
		}
	}
	
}
public void input() {
	Scanner input = new Scanner(System.in);
	System.out.println("Nhập tên tác giả");
	name = input.nextLine();
	System.out.println("Nhập tuổi: ");
	old = Integer.parseInt(input.nextLine());
	System.out.println("Nhập ngày sinh");
	birthday = input.nextLine();
	System.out.println("Nhập địa chỉ");
	address = input.nextLine();
}
public void display () {
	System.out.println(toString());
}
public void delete(ArrayList<BuiHongSon_Sach> bookList, int i) {
	for (int j = 0; j < bookList.size(); j++) {
		if(j == i) {
			bookList.remove(j);
			break;
			
		}
		
	}
}
public String toString() {
	return "Tác giả [Tên=" + name + ", Tuổi=" + old + ", Bút danh=" + nickname + ", Ngày sinh=" + birthday + ", Địa chỉ="
			+ address + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getOld() {
	return old;
}
public void setOld(int old) {
	this.old = old;
}
public String getNickname() {
	return nickname;
}
public void setNickname(String nickname) {
	this.nickname = nickname;
}
public String getBirthday() {
	return birthday;
}
public void setBirthday(String birthday) {
	this.birthday = birthday;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}