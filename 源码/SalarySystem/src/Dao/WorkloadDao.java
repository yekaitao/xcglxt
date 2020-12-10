package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.BaseDao.PackResult;
import modelItem.User;
import modelItem.Workload;

public class WorkloadDao {
	
	public int addWorkload(Workload workload) throws SQLException {
		String sql = "insert into workload value(null, ?, ?, ?, ?, ?, ?, ?)";
		return BaseDao.insertOrUpdateOrDelete(sql, workload.getUserId(), workload.getTerm(), workload.getLessonHour(), workload.getAttendCnt(),workload.getkaiHour(),workload.getfenHour(),workload.getchengHour());
	}
	
	public int updateWorkload(Workload workload) throws SQLException {
		String sql = "update workload set lessonHour=?, attendCnt=?, kaiHour=?, fenHour=?, chengHour=? where userId=? and term=?";
		return BaseDao.insertOrUpdateOrDelete(sql, workload.getLessonHour(), 
				workload.getAttendCnt(), workload.getUserId(), workload.getTerm(), workload.getkaiHour(), workload.getfenHour(), workload.getchengHour());
	}
	
	
	public static Workload getWorkload(String userId, String term) throws SQLException {
		String sql = "select * from workload where userId=? and term=?";
		return BaseDao.select(sql, new PackResult<Workload>() {
			@Override
			public Workload onResultReturn(ResultSet rs) throws Exception {
				return rs.next() ? packToWorkload(rs) : null;
			}
		}, userId, term);
	}
	
	private static Workload packToWorkload(ResultSet rs) {
		try {
			Integer lessonHour = rs.getInt("lessonHour");
			Integer attendCnt = rs.getInt("attendCnt");
			Integer kaiHour = rs.getInt("kaiHour");
			Integer fenHour = rs.getInt("fenHour");
			Integer chengHour = rs.getInt("chengHour");
			
			return new Workload(null, null, null, lessonHour, attendCnt, kaiHour, fenHour, chengHour);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
}
