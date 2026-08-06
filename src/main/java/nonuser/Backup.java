package nonuser;

import java.io.Serializable;

public class Backup implements Serializable {

        private String backupId;
        private String status;

        public Backup(String backupId,String status) {
            this.backupId = backupId;
            this.status = status;
        }

        public String getBackupId() {
            return backupId;
        }

        public String getStatus() {
            return status;
        }

        public void setBackupId(String backupId) {
            this.backupId = backupId;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "Backup{" +
                    "backupId='" + backupId + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }
    }

