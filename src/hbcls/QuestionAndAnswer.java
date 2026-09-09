package hbcls;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "question")
public class QuestionAndAnswer {

    @Id
    @Column(name="qid", length = 30)
    private String qid;
    
    @Column(name="qname", length = 100)
    private String qname;
    
    @Column(name="answers")
    @ElementCollection
    @CollectionTable(name = "answer", joinColumns = {@JoinColumn(name="qid")})
    @OrderColumn(name = "answer_index")
    private List<String> answers;

    public String getQid() {
        return qid;
    }

    public void setQid(String qid) {
        this.qid = qid;
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
    
    
}
