package practica3.entidades;

import javax.persistence.*;

@Entity
@Table(name = "Table_Time")
public class Time {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idd;
	@Column
	private String DateNum;
	@Column
	private String Date;
	@Column
	private String YearMonthNum;
	@Column
	private String Calendar_Quarter;
	@Column
	private String MonthNum;
	@Column
	private String MonthName;
	@Column
	private String MonthShortName;
	@Column
	private String WeekNum;
	@Column
	private String DayNumOfYear;
	@Column
	private String DayNumOfMonth;
	@Column
	private String DayNumOfWeek;
	@Column
	private String DayName;
	@Column
	private String DayShortName;
	@Column
	private String Quarter;
	@Column
	private String YearQuarterNum;
	@Column
	private String DayNumOfQuarter;


	public Time(){
	}

	public Time(String dateNum, String date, String yearMonthNum, String calendar_Quarter, String monthNum, String monthName, String monthShortName, String weekNum, String dayNumOfYear, String dayNumOfMonth, String dayNumOfWeek, String dayName, String dayShortName, String quarter, String yearQuarterNum, String dayNumOfQuarter) {
		setDateNum(dateNum);
		setDate(date);
		setYearMonthNum(yearMonthNum);
		setCalendar_Quarter(calendar_Quarter);
		setMonthNum(monthNum);
		setMonthName(monthName);
		setMonthShortName(monthShortName);
		setWeekNum(weekNum);
		setDayNumOfYear(dayNumOfYear);
		setDayNumOfMonth(dayNumOfMonth);
		setDayNumOfWeek(dayNumOfWeek);
		setDayName(dayName);
		setDayShortName(dayShortName);
		setQuarter(quarter);
		setYearQuarterNum(yearQuarterNum);
		setDayNumOfQuarter(dayNumOfQuarter);
	}



	public int getIdd() {
		return idd;
	}

	public void setIdd(int idd) {
		this.idd = idd;
	}

	public String getDateNum() {
		return DateNum;
	}

	public void setDateNum(String dateNum) {
		DateNum = dateNum;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getYearMonthNum() {
		return YearMonthNum;
	}

	public void setYearMonthNum(String yearMonthNum) {
		YearMonthNum = yearMonthNum;
	}

	public String getCalendar_Quarter() {
		return Calendar_Quarter;
	}

	public void setCalendar_Quarter(String calendar_Quarter) {
		Calendar_Quarter = calendar_Quarter;
	}

	public String getMonthNum() {
		return MonthNum;
	}

	public void setMonthNum(String monthNum) {
		MonthNum = monthNum;
	}

	public String getMonthName() {
		return MonthName;
	}

	public void setMonthName(String monthName) {
		MonthName = monthName;
	}

	public String getMonthShortName() {
		return MonthShortName;
	}

	public void setMonthShortName(String monthShortName) {
		MonthShortName = monthShortName;
	}

	public String getWeekNum() {
		return WeekNum;
	}

	public void setWeekNum(String weekNum) {
		WeekNum = weekNum;
	}

	public String getDayNumOfYear() {
		return DayNumOfYear;
	}

	public void setDayNumOfYear(String dayNumOfYear) {
		DayNumOfYear = dayNumOfYear;
	}

	public String getDayNumOfMonth() {
		return DayNumOfMonth;
	}

	public void setDayNumOfMonth(String dayNumOfMonth) {
		DayNumOfMonth = dayNumOfMonth;
	}

	public String getDayNumOfWeek() {
		return DayNumOfWeek;
	}

	public void setDayNumOfWeek(String dayNumOfWeek) {
		DayNumOfWeek = dayNumOfWeek;
	}

	public String getDayName() {
		return DayName;
	}

	public void setDayName(String dayName) {
		DayName = dayName;
	}

	public String getDayShortName() {
		return DayShortName;
	}

	public void setDayShortName(String dayShortName) {
		DayShortName = dayShortName;
	}

	public String getQuarter() {
		return Quarter;
	}

	public void setQuarter(String quarter) {
		Quarter = quarter;
	}

	public String getYearQuarterNum() {
		return YearQuarterNum;
	}

	public void setYearQuarterNum(String yearQuarterNum) {
		YearQuarterNum = yearQuarterNum;
	}

	public String getDayNumOfQuarter() {
		return DayNumOfQuarter;
	}

	public void setDayNumOfQuarter(String dayNumOfQuarter) {
		DayNumOfQuarter = dayNumOfQuarter;
	}



	@Override
	public String toString() {
		return "";
	}

}
