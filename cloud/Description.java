package cloud;

public class Description
{

    private String label;
    private String summary;

    public Description(String label, String summary) {
        this.label = label;
        this.summary = summary;
    }

    public String getLabel()
    {
        return this.label;
    }

    public String getSummary()
    {
        return this.summary;
    }

    public void setLabel(String label)
    {
        this.label = label;
    }

    public void setSummary(String summary)
    {
        this.summary = summary;
    }

}