package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

public class NoticeDAO {
   DBConnectionMgr mgr;
   Connection con;
   PreparedStatement ps;
   ResultSet rs;

   public NoticeDAO() {
      mgr = DBConnectionMgr.getInstance();
   }

   public void insert(NoticeDTO dto) throws Exception {
      Calendar cal = Calendar.getInstance();
      String today;
      String str = (cal.get(Calendar.YEAR) + "").substring(2);
      today = str + "." + (cal.get(Calendar.MONTH) + 1) + "." + cal.get(Calendar.DATE);
      con = mgr.getConnection();
      String sql = "insert into notice values(?,?,?,?,?,?,?,?,?)";

      ps = con.prepareStatement(sql);

      ps.setString(1, dto.getTitle());
      ps.setString(2, "aaa");
      ps.setString(3, dto.getContent());
      ps.setString(4, today);
      ps.setString(5, dto.getHospital());
      ps.setString(6, dto.getDoctor());
      ps.setInt(7, 1);
      ps.setString(8, dto.getFont());
      ps.setString(9, "noCom");

      ps.executeUpdate();

      ps.close();
      con.close();
   }

   public NoticeDTO select(String value, String search) {
      NoticeDTO dto = null;
      try {

         con = mgr.getConnection();

         String sql = "select * from notice where " + value + " like '%" + search + "%'";
         ps = con.prepareStatement(sql);

         rs = ps.executeQuery();

         if (rs.next()) {
            dto = new NoticeDTO();
            String title = rs.getString(1);
            String name = rs.getString(2);
            String content = rs.getString(3);
            String time = rs.getString(4);
            String hospital = rs.getString(5);
            String doctor = rs.getString(6);
            int unum = rs.getInt(7);
            String font = rs.getString(8);

            dto.setTitle(title);
            dto.setName(name);
            dto.setContent(content);
            dto.setTime(time);
            dto.setHospital(hospital);
            dto.setDoctor(doctor);
            dto.setUnum(unum);
            dto.setFont(font);
         }

      } catch (Exception e) {
         System.out.println("DB泥섎━�뿉�윭");
      } finally {
         try {
            rs.close();
            ps.close();
            con.close();
         } catch (SQLException e) {
            System.out.println("�옄�썝�빐�젣�뿉�윭");
         }
      }
      return dto;

   }

   public void addComment(NoticeDTO dto) {

      try {
         con = mgr.getConnection();
         
         String sql = "update notice notice set comment=? where title = ? and content = ? and time = ? and name=?";
         
         ps = con.prepareStatement(sql);
         
         ps.setString(1, dto.getComment());
         ps.setString(2, dto.getTitle());
         ps.setString(3, dto.getContent());
         ps.setString(4, dto.getTime());
         ps.setString(5, dto.getName());
         
         
         ps.executeUpdate();
         
      } catch (Exception e) {
         e.printStackTrace();
      }finally {
         try {
            ps.close();
            mgr.freeConnection(con);
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
   }

   public void delete(NoticeDTO dto) {
      try {

         con = mgr.getConnection();

         String sql = "delete from notice where title = ? and content = ? and time = ? and name=?";
         ps = con.prepareStatement(sql);
         ps.setString(1, dto.getTitle());
         ps.setString(2, dto.getContent());
         ps.setString(3, dto.getTime());
         ps.setString(4, dto.getName());

         ps.executeUpdate();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            ps.close();
            con.close();
         } catch (SQLException e) {
            System.out.println("�옄�썝�빐�젣�뿉�윭");
         }
      }
   }

   public ArrayList<NoticeDTO> noticeAll() {

      ArrayList<NoticeDTO> list = new ArrayList<NoticeDTO>();
      NoticeDTO dto = null;
      try {
         con = mgr.getConnection();
         String sql = "select * from notice";
         ps = con.prepareStatement(sql);
         rs = ps.executeQuery();
         while (rs.next()) {

            String hospital = rs.getString(5);

            if (hospital != null) {

               dto = new NoticeDTO();

               String title = rs.getString(1);

               String name = rs.getString(2);

               String content = rs.getString(3);

               String time = rs.getString(4);

               String doctor = rs.getString(6);

               int unum = rs.getInt(7);
               String font = rs.getString(8);

               dto.setTitle(title);

               dto.setName(name);

               dto.setContent(content);

               dto.setTime(time);

               dto.setHospital(hospital);

               dto.setDoctor(doctor);

               dto.setUnum(unum);
               dto.setFont(font);

               list.add(dto);

            }

         }

      } catch (Exception e) {

         System.out.println("DB泥섎━ 以� �뿉�윭 諛쒖깮");

      } finally {

         try {

            rs.close();

            ps.close();

            con.close();

         } catch (SQLException e) {

            System.out.println("�옄�썝 �빐�젣 以� �뿉�윭 諛쒖깮");

         }
      }
      return list;
   }

   public ArrayList<NoticeDTO> suggestAll() {
      ArrayList<NoticeDTO> list = new ArrayList<NoticeDTO>();
      NoticeDTO dto = null;
      try {

         con = mgr.getConnection();
         String sql = "select * from notice";
         ps = con.prepareStatement(sql);
         rs = ps.executeQuery();
         while (rs.next()) {

            String hospital = rs.getString(5);

            if (hospital == null) {

               dto = new NoticeDTO();

               String title = rs.getString(1);
               String name = rs.getString(2);
               String content = rs.getString(3);
               String time = rs.getString(4);
               String doctor = rs.getString(6);
               int unum = rs.getInt(7);
               String font = rs.getString(8);
               String comment = rs.getString(9);

               
               dto.setTitle(title);
               dto.setName(name);
               dto.setContent(content);
               dto.setTime(time);
               dto.setHospital(hospital);
               dto.setDoctor(doctor);
               dto.setUnum(unum);
               dto.setFont(font);
               dto.setComment(comment);

               list.add(dto);
            }
         }
      } catch (Exception e) {
         System.out.println("DB泥섎━ 以� �뿉�윭 諛쒖깮");
      } finally {
         try {
            rs.close();
            ps.close();
            con.close();
         } catch (SQLException e) {
            System.out.println("�옄�썝 �빐�젣 以� �뿉�윭 諛쒖깮");
         }
      }
      return list;
   }
   public void updateNotice(NoticeDTO dto,NoticeDTO dto2) {
	   try {
	         con = mgr.getConnection();

	         String sql = "update notice set title = ?,content = ?,font = ? where  title = ? and content = ? and time = ? and name=?";
	         ps = con.prepareStatement(sql);
	         ps.setString(1, dto.getTitle());
	         ps.setString(2, dto.getContent());
	         ps.setString(3, dto.getFont());
	         ps.setString(4, dto2.getTitle());
	         ps.setString(5, dto2.getContent());
	         ps.setString(6, dto2.getTime());
	         ps.setString(7, dto2.getName());

	         ps.executeUpdate();
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            ps.close();
	            con.close();
	         } catch (SQLException e) {
	            System.out.println("�옄�썝�빐�젣�뿉�윭");
	         }
	      }
	   }
}