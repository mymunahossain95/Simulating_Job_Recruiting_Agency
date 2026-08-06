package nonuser;

import java.io.Serializable;

public class SystemSetting implements Serializable {

        private String settingId;
        private String settingType;
        private String settingValue;

        public SystemSetting(String settingId, String settingType, String settingValue) {
            this.settingId = settingId;
            this.settingType = settingType;
            this.settingValue = settingValue;
        }

        public String getSettingId() {
            return settingId;
        }

        public String getSettingType() {
            return settingType;
        }

        public String getSettingValue() {
            return settingValue;
        }

        public void setSettingId(String settingId) {
            this.settingId = settingId;
        }

        public void setSettingType(String settingType) {
            this.settingType = settingType;
        }

        public void setSettingValue(String settingValue) {
            this.settingValue = settingValue;
        }

        @Override
        public String toString() {
            return "SystemSetting{" +
                    "settingId='" + settingId + '\'' +
                    ", settingType='" + settingType + '\'' +
                    ", settingValue='" + settingValue + '\'' +
                    '}';
        }
    }
}
