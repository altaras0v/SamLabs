package L6Tasks.L6Task4;

public class MyRGB {
   public enum RGB{
        GREEN(0,255,0),
        RED(255,0,0),
        BLUE(0,0,255),
        YELLOW(75,75,75),
        PURPLE(63,42,31),
        ORANGE(20,40,240),
        WHITE(0,0,0),
        pink(59,34,118),
        gray(25,25,25);

        private int r;
        private int b;
        private int g;


        RGB(int r, int g, int b){
            this.r = r;
            this.b = b;
            this.g = g;
        }
        public String convertTo(){
            String result = "";
            return Integer.toHexString(r) + Integer.toHexString((int)this.g) + Integer.toHexString((int)this.b);
        }
        public RGB next(){
            RGB[] rgb = values();
            if (ordinal() == 8) {
                return rgb[0];
            }
            else return rgb[this.ordinal()-1];
        }
    }
}
