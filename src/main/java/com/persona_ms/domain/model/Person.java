package com.persona_ms.domain.model;

import java.time.LocalDate;

public class Person {

    private Long personId;
    private Long bootcampId;
    private LocalDate enrollmentDate;
    private LocalDate startDate;
    private Integer durationDays;

    public Person() {
    }

    public Person(Long personId, Long bootcampId, LocalDate enrollmentDate, LocalDate startDate, Integer durationDays) {
        this.personId = personId;
        this.bootcampId = bootcampId;
        this.enrollmentDate = enrollmentDate;
        this.startDate = startDate;
        this.durationDays = durationDays;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getBootcampId() {
        return bootcampId;
    }

    public void setBootcampId(Long bootcampId) {
        this.bootcampId = bootcampId;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Integer getDurationDays() {
        return durationDays;
    }

    public void setDurationDays(Integer durationDays) {
        this.durationDays = durationDays;
    }
}

