package nonuser;

import java.io.Serializable;

public class CandidateFeedback implements Serializable {

        private String candidateName;
        private int rating;
        private String comments;
        private String status;

        public CandidateFeedback(String candidateName,
                                 int rating,
                                 String comments,
                                 String status) {

            this.candidateName = candidateName;
            this.rating = rating;
            this.comments = comments;
            this.status = status;
        }

        public String getCandidateName() {
            return candidateName;
        }

        public int getRating() {
            return rating;
        }

        public String getComments() {
            return comments;
        }

        public String getStatus() {
            return status;
        }

        public void setCandidateName(String candidateName) {
            this.candidateName = candidateName;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "CandidateFeedback{" +
                    "candidateName='" + candidateName + '\'' +
                    ", rating=" + rating +
                    ", comments='" + comments + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }
}
