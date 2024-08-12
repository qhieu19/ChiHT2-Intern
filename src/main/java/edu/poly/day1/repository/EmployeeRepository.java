package edu.poly.day1.repository;

import edu.poly.day1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

//    @Query("""
//    SELECT new edu.poly.day1.
//""")
//    @Query("""
//    SELECT new com.example.tutor_sof306_su24_bl2_final.response.SachResponse
//    (s.ma,s.ten,s.ngayXuatBan,s.soTrang,s.donGia,s.nhaXuatBan.ten)
//    FROM Sach s
//    """)
//    List<SachResponse> getAll();
}
