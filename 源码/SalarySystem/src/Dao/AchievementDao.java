package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import Dao.BaseDao.PackResult;
import modelItem.Achievement;
import modelItem.User;
import modelItem.Workload;

public class AchievementDao {
	
	public static int addachievement(Achievement achievement) throws SQLException {
		String sql = "insert into achievement values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
		return BaseDao.insertOrUpdateOrDelete(sql, achievement.getId(), achievement.getUserId(), achievement.getBen(), 
				achievement.getKai(),achievement.getFeng(),achievement.getCheng(),achievement.getZhiwu(),achievement.getDianhua(),
				achievement.getShenghuo(),achievement.getJieri(),achievement.getKoufa(),achievement.getJiaban(),achievement.getQita(),
				achievement.getLinshi(),achievement.getBuchong(),achievement.getMonth(),achievement.getTotal_kechou(),achievement.getTotal_butie(),achievement.getmTAO_State());
	}
	
//	public int updateAchievement(Achievement achievement) throws SQLException {
//		String sql = "update achievement set lessonHour=?, attendCnt=?, kaiHour=?, fenHour=?, chengHour=? where userId=? and term=?";
//		return BaseDao.insertOrUpdateOrDelete(sql, Achievement.getId(), Achievement.getUserId(), Achievement.getBen(), Achievement.getKai(),Achievement.getFeng(),Achievement.getCheng(),Achievement.getZhiwu(),Achievement.getDianhua(),Achievement.getShenghuo(),Achievement.getJieri(),Achievement.getKoufa(),Achievement.getJiaban(),Achievement.getQita(),Achievement.getLinshi(),Achievement.getBuchong(),Achievement.getMonth(),Achievement.getTotal_kechou(),Achievement.getTotal_butie());
//	}
	
	
	public static Achievement getAchievement(String userId, String month) throws SQLException {
		String sql = "select * from achievement where userId=? and month=?";
		return BaseDao.select(sql, new PackResult<Achievement>() {
			@Override
			public Achievement onResultReturn(ResultSet rs) throws Exception {
				return rs.next() ? packToAchievement(rs) : null;
			}
		}, userId, month);
	}
	
	
	
	private static Achievement packToAchievement(ResultSet rs) {
		try {
			String ben = rs.getString("ben");
			String kai = rs.getString("kai");
			String feng = rs.getString("feng");
			String cheng = rs.getString("cheng");
			String zhiwu = rs.getString("zhiwu");
			String dianhua = rs.getString("dianhua");
			String shenghuo = rs.getString("shenghuo");
			String jieri = rs.getString("jieri");
			String koufa = rs.getString("koufa");
			String jiaban = rs.getString("jiaban");
			String qita = rs.getString("qita");
			String linshi = rs.getString("linshi");
			String buchong = rs.getString("buchong");
			String month = rs.getString("month");
			String total_kechou = rs.getString("total_kechou");
			String total_butie = rs.getString("total_butie");
			String mTAO_State = rs.getString("mTAO_State");
			
			
			return new Achievement(null, null, ben, kai,feng, cheng, zhiwu, dianhua,shenghuo,jieri,koufa,jiaban,qita,linshi,buchong,month,total_kechou,total_butie,mTAO_State);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
}
