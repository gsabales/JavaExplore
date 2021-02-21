package com.javaexplore.control_flow_challenges;

public class PaintJob {

    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        double wallArea = width * height;

        if (width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets >= 0) {
            try {
                double bucketCount = ((wallArea - (areaPerBucket * extraBuckets)) / areaPerBucket);
                return  (int) Math.ceil(bucketCount);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        return -1;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        double wallArea = width * height;

        if (width > 0 && height > 0 && areaPerBucket > 0) {
            try {
                double bucketCount = wallArea / areaPerBucket;
                return  (int) Math.ceil(bucketCount);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        return -1;
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area > 0 && areaPerBucket > 0) {
            try {
                double bucketCount = area / areaPerBucket;
                return  (int) Math.ceil(bucketCount);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        return -1;
    }
}
