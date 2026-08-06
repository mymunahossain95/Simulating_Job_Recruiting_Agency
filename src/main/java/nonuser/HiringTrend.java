package nonuser;

import java.io.Serializable;

public class HiringTrend implements Serializable {

        private String companyName;
        private String industry;
        private int vacanciesPosted;
        private String hiringTrend;

        public HiringTrend(String companyName,
                           String industry,
                           int vacanciesPosted,
                           String hiringTrend) {

            this.companyName = companyName;
            this.industry = industry;
            this.vacanciesPosted = vacanciesPosted;
            this.hiringTrend = hiringTrend;
        }

        public String getCompanyName() {
            return companyName;
        }

        public String getIndustry() {
            return industry;
        }

        public int getVacanciesPosted() {
            return vacanciesPosted;
        }

        public String getHiringTrend() {
            return hiringTrend;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public void setIndustry(String industry) {
            this.industry = industry;
        }

        public void setVacanciesPosted(int vacanciesPosted) {
            this.vacanciesPosted = vacanciesPosted;
        }

        public void setHiringTrend(String hiringTrend) {
            this.hiringTrend = hiringTrend;
        }

        @Override
        public String toString() {
            return "HiringTrend{" +
                    "companyName='" + companyName + '\'' +
                    ", industry='" + industry + '\'' +
                    ", vacanciesPosted=" + vacanciesPosted +
                    ", hiringTrend='" + hiringTrend + '\'' +
                    '}';
        }
}
