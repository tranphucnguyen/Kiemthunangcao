# Kiểm thử nâng cao với JUnit

## 1.Mô tả bài tập
  Dùng ChatGPT với lệnh sau:
  Cho tôi bài tập kiểm thử nâng cao với JUnit, chương trình là các thuật toán thông dụng, có các loại cấu trúc điều khiển và các kiểu/cấu trúc dữ liệu phong phú.
  Sau đó thực hiện kiểm thử tương tự bài 1 (nộp bài lên repo, tạo readme.md,..) đồng thời chia sẻ liên kết ChatGPT mà bạn đã thực hiện ở trên. 
  Tiếp đó, tìm cách đo mức độ bao phủ kiểm thử (test coverage), sau đó bổ sung ca kiểm thử để tăng mức độ bao phủ kiểm thử dòng lệnh (statement coverage) lên cao nhất (100%).

## 2.Mã nguồn
### AlgorithmUtils.java
![image](https://github.com/user-attachments/assets/614ed64d-89c2-45a7-aa92-6275fd592a48)
### AlgorithmUtilsTest.java
![image](https://github.com/user-attachments/assets/f2930a90-9a9e-418d-a9c0-87b588b97bf0)

## 3.Kết quả thực nghiệm
![image](https://github.com/user-attachments/assets/9be3006d-c953-4982-a74f-90627c2182af)
## 4.Các bước triển khai

1. **Cài đặt Dự án**:
   - Tải mã nguồn từ kho chứa của dự án hoặc sao chép mã vào một thư mục làm việc.
   - Cài đặt **Maven** và **JDK** nếu chưa có.

2. **Biên dịch và Kiểm thử**:
   - Chạy lệnh sau để biên dịch và kiểm thử dự án:
     ```bash
     mvn test
     ```

3. **Đo Lường Độ Bao phủ Kiểm thử**:
   - Sau khi chạy kiểm thử, độ bao phủ mã sẽ được đo lường và báo cáo sẽ được tạo trong thư mục `target/site/jacoco`.
   - Để xem báo cáo độ bao phủ, mở file `target/site/jacoco/index.html` trong trình duyệt.

4. **Báo cáo Độ Bao phủ**:
   - Báo cáo JaCoCo cung cấp cái nhìn chi tiết về mức độ bao phủ các dòng mã và các phần chưa được kiểm thử.

## 5.Công cụ sử dụng

1. **Spring Boot**:
   - Framework Java phổ biến dùng để xây dựng ứng dụng web, với cấu hình đơn giản và khả năng mở rộng mạnh mẽ.

2. **JUnit 5**:
   - Framework kiểm thử phổ biến trong Java, được sử dụng để kiểm thử các phương thức và đảm bảo chất lượng mã nguồn.

3. **JaCoCo**:
   - Công cụ mã nguồn mở để đo lường độ bao phủ mã trong Java. JaCoCo tích hợp trực tiếp với Maven và giúp theo dõi các dòng mã đã được kiểm thử.

## 6.Đường dẫn Chatpgt
https://chatgpt.com/share/677b9065-cf94-8006-a359-c53e7217e1af
