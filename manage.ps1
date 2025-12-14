param(
    [Parameter(Mandatory=$true)]
    [ValidateSet("hide", "show")]
    [string]$Action
)

Write-Host "Running action: $Action" -ForegroundColor Cyan

if ($Action -eq "hide") {
    mvn compile exec:java "-Dexec.args=hide"
} elseif ($Action -eq "show") {
    mvn compile exec:java "-Dexec.args=show"
}
