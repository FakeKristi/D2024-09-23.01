import javax.management.monitor.StringMonitor;

public class Motorka extends Vozidlo {
        String typMotoru;
        public Motorka (String spz, String vyrobce, String model, int rokVyroby, String typMotoru) {
            super(spz, vyrobce, model, rokVyroby);
            this.typMotoru = typMotoru;
        }

        public String getTypMotoru() {
            return typMotoru;
        }

        public void setTypMotoru(String typMotoru) {
            this.typMotoru = typMotoru;
        }

        @Override
        public String toString() {
            return super.toString()+", Typ motoku: ["+typMotoru+"]";
        }

}
