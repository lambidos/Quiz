package bouzhar.quiz.demo.assignment.Dtos;

import bouzhar.quiz.demo.question.dto.QuestionWithSimpleAnswers;
import bouzhar.quiz.demo.response.dto.ResponseResDto;
import bouzhar.quiz.demo.student.dto.StudentSimpleDto;
import bouzhar.quiz.demo.temporization.TemporizationResDto;
import bouzhar.quiz.demo.test.Dtos.TestResSimpleAttributesDto;
import bouzhar.quiz.demo.test.Dtos.TestResSimpleWithQuestionsDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class AssignmentCorrection {
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endDate;

    private Integer chance;

    private TestResSimpleAttributesDto test;
    private StudentSimpleDto student;
    private Boolean isPassed;
    @JsonIgnore
    private List<ResponseResDto> responses;
    private List<QuestionWithSimpleAnswers> answeredQuestions;
    private List<TemporizationResDto> temporizations;
}
