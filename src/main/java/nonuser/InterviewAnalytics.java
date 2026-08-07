package nonuser;

import java.io.Serializable;

public class InterviewAnalytics implements Serializable {
        private String candidateName;
        private double score;
        private String result;
        private String successRate;

        public InterviewAnalytics(String candidateName,
                                  double score,
                                  String result,
                                  String successRate) {

            this.candidateName = candidateName;
            this.score = score;
            this.result = result;
            this.successRate = successRate;
        }

        public String getCandidateName() {
            return candidateName;
        }

        public double getScore() {
            return score;
        }

        public String getResult() {
            return result;
        }

        public String getSuccessRate() {
            return successRate;
        }

        public void setCandidateName(String candidateName) {
            this.candidateName = candidateName;
        }

        public void setScore(double score) {
            this.score = score;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public void setSuccessRate(String successRate) {
            this.successRate = successRate;
        }

        @Override
        public String toString() {
            return "InterviewAnalytics{" +
                    "candidateName='" + candidateName + '\'' +
                    ", score=" + score +
                    ", result='" + result + '\'' +
                    ", successRate=" + successRate +
                    '}';
        }
}


