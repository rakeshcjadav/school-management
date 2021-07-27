package com.shoolmanagement;

// Singleton class
public class SchoolManager {

    // region Static

    private static SchoolManager Singleton_Instance;

    public static SchoolManager Get()
    {
        if(Singleton_Instance == null)
            Singleton_Instance = new SchoolManager();
        return Singleton_Instance;
    }

    // endregion

    private String SchoolName;

    // Constructor is private because this class is singleton
    private SchoolManager()
    {
    }

    public void SetSchoolName(String strSchoolName)
    {
        SchoolName = strSchoolName;
    }

    public String GetSchoolName() {
        return SchoolName;
    }
}
