package ro.teamnet.zth.appl.domain;

import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.annotations.Table;

/**
 * Created by Andreea.Puscasu on 7/12/2017.
 */
@Table(name="Jobs")
public class Jobs {
    @Id(name ="job_id")
    private long job_id;
    @Column(name="job_title")
    private String job_title;
    @Column(name="min_salary")
    private long min_salary;
    @Column(name="max_salary")
    private long max_salary;

    public long getJob_id() {
        return job_id;
    }

    public void setJob_id(long job_id) {
        this.job_id = job_id;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public long getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(long min_salary) {
        this.min_salary = min_salary;
    }

    public long getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(long max_salary) {
        this.max_salary = max_salary;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
