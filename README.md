## PathParser
```

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
        
        Path rectanglePath = resizePath(PathParser.createPathFromPathData(CraftPrintUtils.DIAMOND), mWidthCrop, mHeightCrop);
        if (canvas.getHeight() > canvas.getWidth()) {
            rectanglePath.offset(40, 0);
        } else {
            rectanglePath.offset(0, 40);
        }
        return rectanglePath;
    }
```