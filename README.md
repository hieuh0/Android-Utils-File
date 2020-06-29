## PathParser
```
   //convert svg to path: https://image.online-convert.com/convert-to-svg
    public static final String DIAMOND = "M256 0L59.83 256 256 512l196.17-256z";

    public static Path resizePath(Path path, float width, float height) {
        RectF bounds = new RectF(0, 0, width, height);
        Path resizedPath = new Path(path);
        RectF src = new RectF();
        resizedPath.computeBounds(src, true);

        Matrix resizeMatrix = new Matrix();
        resizeMatrix.setRectToRect(src, bounds, Matrix.ScaleToFit.CENTER);
        resizedPath.transform(resizeMatrix);

        return resizedPath;
    }

      private Path getDiamondPath() {
        
        Path rectanglePath = resizePath(PathParser.createPathFromPathData(DIAMOND), mWidthCrop, mHeightCrop);
        if (canvas.getHeight() > canvas.getWidth()) {
            rectanglePath.offset(40, 0);
        } else {
            rectanglePath.offset(0, 40);
        }
        return rectanglePath;
    }
```
## Calculator distance
```
public double distanceBetweenTwoPoint(double srcLat, double srcLng, double desLat, double desLng) {
            double earthRadius = 3958.75;
            double dLat = Math.toRadians(desLat - srcLat);
            double dLng = Math.toRadians(desLng - srcLng);
            double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                    + Math.cos(Math.toRadians(srcLat))
                    * Math.cos(Math.toRadians(desLat)) * Math.sin(dLng / 2)
                    * Math.sin(dLng / 2);
            double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
            double dist = earthRadius * c;

            double meterConversion = 1609;

            return (int) (dist * meterConversion);
        }
````
