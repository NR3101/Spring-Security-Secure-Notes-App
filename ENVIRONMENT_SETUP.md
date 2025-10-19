# Spring Security Secure Notes App - Environment Configuration

This file provides instructions on how to set up your environment variables for the application.

## Setup Instructions

1. Copy `.env.example` to `.env`:
   ```bash
   cp .env.example .env
   ```

2. Fill in your actual credentials in the `.env` file

3. Set up environment variables in your IDE or use a tool like `dotenv` to load them

## Required Environment Variables

### Database Configuration
- `DATABASE_URL`: Your PostgreSQL database URL (e.g., jdbc:postgresql://localhost:5432/secure_notes)
- `DATABASE_USERNAME`: Database username
- `DATABASE_PASSWORD`: Database password

### GitHub OAuth
- `GITHUB_CLIENT_ID`: Your GitHub OAuth App Client ID
- `GITHUB_CLIENT_SECRET`: Your GitHub OAuth App Client Secret

**How to get GitHub OAuth credentials:**
1. Go to GitHub Settings > Developer settings > OAuth Apps
2. Click "New OAuth App"
3. Fill in the details and get your Client ID and Secret

### Google OAuth
- `GOOGLE_CLIENT_ID`: Your Google OAuth Client ID
- `GOOGLE_CLIENT_SECRET`: Your Google OAuth Client Secret

**How to get Google OAuth credentials:**
1. Go to Google Cloud Console
2. Create a new project or select existing
3. Enable Google+ API
4. Create OAuth 2.0 credentials

### Email Configuration
- `MAIL_USERNAME`: Your Gmail address
- `MAIL_PASSWORD`: Your Gmail App Password (not your regular password)

**How to get Gmail App Password:**
1. Enable 2-Step Verification on your Google Account
2. Go to Google Account > Security > App passwords
3. Generate a new app password

### JWT Configuration
- `JWT_SECRET`: A secure random string (at least 256 bits recommended)

**Generate a secure JWT secret:**
```bash
openssl rand -base64 64
```

### Frontend Configuration
- `FRONTEND_URL`: Your frontend application URL (default: http://localhost:3000)

## Security Notes

⚠️ **NEVER commit your `.env` file to version control!**
- The `.env` file is already in `.gitignore`
- Only commit `.env.example` with placeholder values
- Keep your secrets safe and rotate them regularly

